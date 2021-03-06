package com.greentrade.common.utils;

import com.greentrade.common.base.GTException;

public interface ExceptionType {

    // Lỗi hệ thống (Chung chung)
    String E99999 = "E99999";
//
//    // Trùng key
//    String E10001 = "E10001";
//
//    // Null
//    String E10002 = "E10002";
//
//    // Quyền
//    String E10003 = "E10003";
//
//    // khong ton tai khoa ngoai
//    String E10004 = "E10004";
//
//    // check out of date
//    String E10005 = "E10005";
//
//    // xoa: ton tai du lieu lien quan
//    String E10006 = "E10006";
//
//    // Invalid token
//    String E20001 = "E20001";
//
//    // Expired jwt token
//    String E20002 = "E20002";
//
//    // Unsupported jwt token
//    String E20003 = "E20003";
//
//    // jwt claims string is empty
//    String E20004 = "E20004";
//
//    // Invalid user
//    String E20005 = "E20005";



    String E100_001 = "E100_001"; // Dữ liệu %s bị null
    String E100_002 = "E100_002"; // Không tìm thấy %s trong cơ sở dữ liệu
    String E100_003 = "E100_003"; // Trạng thái không hợp lệ
    String E100_004 = "E100_004"; // Trạng thái không hợp lệ

    // ================================ sysBranch =========================================
    String E101_001 = "E101_001"; // Dữ liệu %s bị null

    // ================================ sysUnit =========================================
    String E102_001 = "E102_001"; // Dữ liệu %s bị null

    // ================================ sysHoliday =========================================
    String E103_001 = "E103_001"; // Ngày %s đã tồn tại trong cơ sở dữ liệu

    // ================================ sysParamAddition =========================================
    String E104_001 = "E104_001"; // Tham số hệ thống %s, %s đã tồn tại trong cơ sở dữ liệu

    // ================================ corCashTrans =========================================
    String E105_001 = "E105_001"; // Trạng thái của %s, %s hiện tại là chưa duyệt, vui lòng duyệt trước khi thực hiện

    // ================================ corMoneySource =========================================
    String E106_001 = "E106_001"; // Nguồn tiền %s đã tồn tại trong cơ sở dữ liệu

    // ================================ corCashMovSource =========================================
    String E107_001 = "E107_001"; // Phải có ít nhất 1 nguồn tiền để thêm vào

    // ================================ corCashMov =========================================
    String E108_001 = "E108_001";

    // ================================ sysMenu =========================================
    String E109_001 = "E109_001"; // Không tìm thấy menu %s trong cơ sở dữ liệu

    // ================================ sysParams =========================================
    String E110_001 = "E110_001"; //

    // ================================ sysRole =========================================
    String E111_001 = "E111_001"; // Không tìm thấy quyền %s trong cơ sở dữ liệu

    // ================================ rhtRightInfo =========================================
    String E112_001 = "E112_001"; // Quyền cổ phiếu đã tồn tại trong cơ sở dữ liệu

    // ================================ rhtStockOwner =========================================
    String E113_001 = "E113_001"; // Quyền cổ phiếu của tiểu khoản %s đã tồn tại trong cơ sở dữ liệu

    // ================================ sysUser =========================================
    String E114_001 = "E114_001"; // Dữ liệu %s bị null
    // ================================ sysUserGroup =========================================
    String E115_001 = "E115_001";
    // ================================ sysUserGroupDetail =========================================
    String E116_001 = "E116_001";
    // ================================ sysUserGroupMenu =========================================
    String E117_001 = "E117_001";
    // ================================ sysUserGroupRole =========================================
    String E118_001 = "E118_001";
    // ================================ rhtCashDividend =========================================
    String E119_001 = "E119_001";
    // ================================ rhtCashDividendDetail =========================================
    String E120_001 = "E120_001";
    // ================================ rhtStockDividend =========================================
    String E121_001 = "E121_001";
    // ================================ CorSecMov =========================================
    String E122_001 = "E122_001";
    // ================================ CorCashSummary =========================================
    String E123_001 = "E123_001";
    // ================================ MrgProductSec =========================================
    String E124_001 = "E124_001";
    // ================================ MrgProduct =========================================
    String E125_001 = "E125_001";
    // ================================ MrgMonitorSubAcco =========================================
    String E126_001 = "E126_001";
    // ================================ OrdOrder =========================================
    String E127_001 = "E127_001";



    // ================================ CorCashTransferBank =========================================
    String E201_001 = "E201_001";
    // ================================ CorCashTransferLocal =========================================
    String E202_001 = "E202_001";
    // ================================ CorGlobalTrans =========================================
    String E203_001 = "E203_001";
    // ================================ SysBusinessDate =========================================
    String E204_001 = "E204_001";
    // ================================ Token =========================================
    String E205_001 = "E205_001";
    // ================================ RhtCapitalIncrease =========================================
    String E206_001 = "E206_001";
    // ================================ RhtCapitalIncreaseRegister =========================================
    String E207_001 = "E207_001";
    // ================================ PflPortfolioTrans =========================================
    String E208_001 = "E208_001";
    // ================================ PflPortfolio =========================================
    String E209_001 = "E209_001";
    // ================================ OrdPosition =========================================
    String E210_001 = "E210_001";
    // ================================ OrdPositionClose =========================================
    String E211_001 = "E211_001";
    // ================================ OrdSettlement =========================================
    String E212_001 = "E212_001";
    // ================================ OrdResult =========================================
    String E213_001 = "E213_001";
    // ================================ MrgMonitorSec =========================================
    String E214_001 = "E214_001";
    // ================================ MstSecPrice =========================================
    String E215_001 = "E215_001";
    // ================================ SysBatchJobConfig =========================================
    String E217_001 = "E217_001";
    // ================================ SysBatchJobExec =========================================
    String E218_001 = "E218_001";
    // ================================ MstSecPriceEst =========================================
    String E219_001 = "E219_001";
    // ================================ SysCustNotice =========================================
    String E220_001 = "E220_001";
    // ================================ OrdRemoteOrder =========================================
    String E221_001 = "E221_001";
    // ================================ OrdRemoteResult =========================================
    String E222_001 = "E222_001";
    // ================================ SysSendRequest =========================================
    String E223_001 = "E223_001";
    // ================================ SysMsgTemplate =========================================
    String E224_001 = "E224_001";
    // ================================ CorCustomer =========================================
    String E225_001 = "E225_001";
    // ================================ CorFrontUser =========================================
    String E226_001 = "E226_001";
    // ================================ SysOtp =========================================
    String E227_001 = "E227_001";
    // ================================ CorSubAcco =========================================
    String E228_001 = "E228_001";
    // ================================ CorCustomerBankAcco =========================================
    String E229_001 = "E229_001";
    // ================================ CorCustomerPending =========================================
    String E230_001 = "E230_001";
    // ================================OrdOrderMapping =========================================
    String E231_001 = "E231_001";
    // ================================MstProvince =========================================
    String E232_001 = "E232_001";
    // ================================MstCountry =========================================
    String E233_001 = "E233_001";
    // ================================SysCustNoticeMark =========================================
    String E234_001 = "E234_001";
    // ================================SysCustDevices =========================================
    String E235_001 = "E235_001";
    // ================================CorMoneySourceMove =========================================
    String E236_001 = "E236_001";
    // ================================CorSubAccoPending =========================================
    String E237_001 = "E237_001";
    // ================================MstSec =========================================
    String E238_001 = "E238_001";
}
