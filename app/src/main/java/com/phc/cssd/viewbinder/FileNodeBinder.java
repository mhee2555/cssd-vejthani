package com.phc.cssd.viewbinder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phc.cssd.R;
import com.phc.cssd.bean.File;
import com.stargreatsoftware.sgtreeview.TreeNode;
import com.stargreatsoftware.sgtreeview.TreeViewBinder;


/**
 * Created by tlh on 2016/10/1 :)
 */

public class FileNodeBinder extends TreeViewBinder<FileNodeBinder.ViewHolder> {
    @Override
    public ViewHolder provideViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    public void bindView(ViewHolder holder, int position, TreeNode node) {
        File fileNode = (File) node.getContent();
        String Txt = fileNode.fileName;
        holder.tvName.setText(Txt.substring(1,Txt.length()));
            switch( Integer.parseInt( Txt.substring(0,1) ) ){
                case 1:holder.icLogo.setImageResource(R.drawable.ic_calendar_blue);break;
                case 2:holder.icLogo.setImageResource(R.drawable.ic_dep_blue);break;
                case 3:holder.icLogo.setImageResource(R.drawable.ic_export_blue);break;
                case 4:holder.icLogo.setImageResource(R.drawable.ic_stock_blue);break;
                case 5:holder.icLogo.setImageResource(R.drawable.ic_note_blue);break;
            }
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_file;
    }

    public class ViewHolder extends TreeViewBinder.ViewHolder {
        public TextView tvName;
        private ImageView icLogo;

        public ViewHolder(View rootView) {
            super(rootView);
            this.tvName = (TextView) rootView.findViewById(R.id.tv_name);
            this.icLogo = (ImageView) rootView.findViewById(R.id.ic_logo);
        }
    }
}
