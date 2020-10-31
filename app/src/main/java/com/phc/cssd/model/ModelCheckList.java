package com.phc.cssd.model;

public class ModelCheckList {
    String ID;
    String Send_ID;
    String itemcode;
    String itemname;
    String Item_Detail_ID;
    String Qty;
    String AdminRemark;
    String DateRemark;
    String Remark;
    String NameType;
    String Picture_set;
    String Picture_detail;
    String usage_item_code;
    String usage_item_name;
    String RowID;
    String AdminApprove;
    String QtyItemDetail;
    String IsPicture;
    String RemarkDocNo;
    String configuration;
    String IsRemarkRound_RemarlAdmin;
    String IsRemarkRound;
    String Internal = "0";
    boolean IsCheck = false;

    public ModelCheckList(String configuration, String IsRemarkRound_RemarlAdmin, String IsRemarkRound, String RemarkDocNo, String IsPicture, String QtyItemDetail, String AdminApprove, String RowID, String ID, String send_ID, String itemcode, String itemname, String Item_Detail_ID,String qty, String adminRemark, String dateRemark, String remark, String nameType, String picture_set, String picture_detail, String usage_item_code, String usage_item_name, boolean isCheck) {
        this.configuration = configuration;
        this.IsRemarkRound_RemarlAdmin = IsRemarkRound_RemarlAdmin;
        this.IsRemarkRound = IsRemarkRound;
        this.RemarkDocNo = RemarkDocNo;
        this.IsPicture = IsPicture;
        this.QtyItemDetail = QtyItemDetail;
        this.AdminApprove = AdminApprove;
        this.RowID = RowID;
        this.ID = ID;
        Send_ID = send_ID;
        this.itemcode = itemcode;
        this.itemname = itemname;
        this.Item_Detail_ID = Item_Detail_ID;
        Qty = qty;
        AdminRemark = adminRemark;
        DateRemark = dateRemark;
        Remark = remark;
        NameType = nameType;
        Picture_set = picture_set;
        Picture_detail = picture_detail;
        this.usage_item_code = usage_item_code;
        this.usage_item_name = usage_item_name;
        IsCheck = isCheck;
    }

    public String getInternal() {
        return Internal;
    }

    public void setInternal(String internal) {
        Internal = internal;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getIsRemarkRound_RemarlAdmin() {
        return IsRemarkRound_RemarlAdmin;
    }

    public void setIsRemarkRound_RemarlAdmin(String isRemarkRound_RemarlAdmin) {
        IsRemarkRound_RemarlAdmin = isRemarkRound_RemarlAdmin;
    }

    public String getIsRemarkRound() {
        return IsRemarkRound;
    }

    public void setIsRemarkRound(String isRemarkRound) {
        IsRemarkRound = isRemarkRound;
    }

    public String getRemarkDocNo() { return RemarkDocNo; }

    public void setRemarkDocNo(String remarkDocNo) { RemarkDocNo = remarkDocNo; }

    public String getIsPicture() { return IsPicture; }

    public void setIsPicture(String isPicture) { IsPicture = isPicture; }

    public String getQtyItemDetail() { return QtyItemDetail; }

    public void setQtyItemDetail(String qtyItemDetail) { QtyItemDetail = qtyItemDetail; }

    public String getAdminApprove() { return AdminApprove; }

    public void setAdminApprove(String adminApprove) { AdminApprove = adminApprove; }

    public String getRowID() { return RowID; }

    public void setRowID(String rowID) { RowID = rowID; }

    public String getItem_Detail_ID() { return Item_Detail_ID; }

    public void setItem_Detail_ID(String item_Detail_ID) { Item_Detail_ID = item_Detail_ID; }

    public String getUsage_item_code() {
        return usage_item_code;
    }

    public void setUsage_item_code(String usage_item_code) { this.usage_item_code = usage_item_code; }

    public String getUsage_item_name() {
        return usage_item_name;
    }

    public void setUsage_item_name(String usage_item_name) { this.usage_item_name = usage_item_name; }

    public String getPicture_set() {
        return Picture_set;
    }

    public void setPicture_set(String picture_set) {
        Picture_set = picture_set;
    }

    public String getPicture_detail() {
        return Picture_detail;
    }

    public void setPicture_detail(String picture_detail) {
        Picture_detail = picture_detail;
    }

    public String getNameType() {
        return NameType.equals("-") ? "" : ("ประเภท : " + NameType);
    }

    public void setNameType(String nameType) {
        NameType = nameType;
    }

    public boolean isCheck() { return IsCheck; }

    public boolean setCheck(boolean check) { IsCheck = check;return check; }

    public boolean getCheck() { return IsCheck; }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSend_ID() { return Send_ID; }

    public void setSend_ID(String send_ID) {
        Send_ID = send_ID;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String qty) {
        Qty = qty;
    }

    public String getAdminRemark() { return AdminRemark.equals("-") ? "" : ("By : " + AdminRemark); }

    public void setAdminRemark(String adminRemark) {
        AdminRemark = adminRemark;
    }

    public String getDateRemark() {
        return Remark.equals("-") ? "" : DateRemark;
    }

    public void setDateRemark(String dateRemark) {
        DateRemark = dateRemark;
    }

    public String getRemark() {
        return Remark.equals("-") ? "" : ("Remark : " + Remark);
    }

    public void setRemark(String remark) {
        Remark = remark;
    }
}
