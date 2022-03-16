package com.greentrade.common.utils;

public class CmnEnums {

    public interface SysBranchStatus {
        int OPEN = 1;
        int CLOSE = 2;
    }

    interface UserStatus {
        int Open = 1;
        int Closed = 2;
    }

    interface BranchStatus {
        int Open = 1;
        int Closed = 2;
    }

    interface UnitStatus {
        int Open = 1;
        int Closed = 2;
    }

    public interface CorGlobalTransChannel {
        int BACKEND = 1;
        int WEB = 2;
        int APP = 3;
    }

    public interface CorGlobalTransStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int CANCEL = 255;
    }

    public interface CorCashTransTradeType {
        int WITHDRAW = 1;
        int DEPOSIT = 2;
    }

    public interface CorCashTransStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int DELETE = 254;
        int CANCEL = 255;
    }

    public interface CorCashTransferBankStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int DELETE = 254;
        int CANCEL = 255;
    }

    public interface CorCashTransferLocalStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int DELETE = 254;
        int CANCEL = 255;
    }

    public interface CorCashSummaryActionType {
        int INCREASE = 1;
        int APPROVE = 2;
        int CANCEL_NOT_APPROVE = 3;
        int CANCEL_APPROVE = 4;
    }

    public interface GroupCd {
        String CT00 = "CT00";
        String RH00 = "RH00";
        String CU00 = "CU00";
    }

    public interface TaskCd {
        String CT01 = "CT01";
        String CT02 = "CT02";
        String CT03 = "CT03";
        String CT04 = "CT04";
        String RH01 = "RH01";
        String RH02 = "RH02";
        String RH03 = "RH03";
        String RH04 = "RH04";
        String RH05 = "RH05";
        String RH06 = "RH06";
        String RH07 = "RH07";
        String RH08 = "RH08";
        String RH09 = "RH09";
        String CU01 = "CU01";
        String CU02 = "CU02";
        String CU03 = "CU03";
    }

    public interface AmountType {
        String CT0001 = "CT0001";
        String CT0002 = "CT0002";
        String CT0003 = "CT0003";
        String CT0004 = "CT0004";
        String CT0005 = "CT0005";
        String CT0006 = "CT0006";
        String CT0007 = "CT0007";

        String RH0001 = "RH0001";
        String RH0002 = "RH0002";
        String RH0003 = "RH0003";
        String RH0004 = "RH0004";
        String RH0005 = "RH0005";
    }

    public interface QuantityType {
        String RH0001 = "RH0001";
        String RH0002 = "RH0002";
    }

    public interface RhtCashDividendDetailStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int CANCEL = 255;
    }

    public interface RhtStockOwnerStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int CANCEL = 255;
    }
    public interface RhtStockOwnerCompareStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
    }
    public interface RhtRightInfoStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int CANCEL = 255;
    }

    public interface RhtCashDividendPaymentStatus {
        int NOT_PAY = 1;
        int PAYED_PIECE = 2;
        int PAYED_ALL = 3;
    }

    public interface RhtCashDividendStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int CANCEL = 3;
    }

    public interface RhtStockDividendPaymentStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int APPROVE_TRANSACTION = 3;
    }

    public interface RhtStockDividendStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int APPROVE_TRANSACTION = 3;
        int CANCEL = 255;
    }

    public interface CorSecMovSecType {
        int T0 = 1;
        int T1 = 2;
        int T2 = 3;
        int WAIT = 4;
    }
    public interface CorSecMovTradeType {
        int DECREASE = 1;
        int INCREASE = 2;
    }
    public interface CorSecMovStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int CANCEL = 255;
    }

    public interface RhtCapitalIncreaseStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int CANCEL = 255;
    }

    public interface RhtCapitalIncreasePaymentStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int APPROVE_PAYMENT = 3;
        int CANCEL = 255;
    }

    public interface CorCashMoveStatus {
        int NOT_APPROVE = 1;
        int APPROVE = 2;
        int CANCEL = 255;
    }

    public interface CorCashMoveTradeType {
        int DECREASE = 1;
        int INCREASE = 2;
    }

    public interface OrdOrderTradeType {
        int SELL = 1;
        int BUY = 2;
    }

    public interface JobConfigGroupTpe {
        int OPENDATE = 1;
        int BEGINDATE = 2;
        int ENDDATE = 3;
        int CLOSEDATE = 4;
        int ENDMONTH = 5;
    }

    public interface JobConfigActionType {
        int OPENDATE_OPENDATE = 1;
        int BEGINDATE_RIGHTAPPROVE = 1;
        int BEGINDATE_STOCKDIVIDEND_PAY = 2;
        int BEGINDATE_STOCKDIVIDEND_PAYMENTTRADE = 3;
        int BEGINDATE_CAPITALINCREASE_PAY = 4;
        int BEGINDATE_CAPITALINCREASE_PAYMENTTRADE = 5;
        int BEGINDATE_CASHDIVIDEND_PAY = 6;
        int CLOSEDATE_CLOSEDATE = 1;
    }
    public interface JobExecStatus {
        int RUNED = 2;
        int NOT_RUN = 1;
    }

    public interface SendRequestSendType {
        int EMAIL = 1;
        int SMS = 2;
    }

    public interface SendRequestType {
        int ACTIVE_ACCOUNT = 1;
        int OTP = 2;
        int RESET_PASS = 3;
        int RESET_PIN = 4;
        int CHANGE_PASS_OTP = 5;
        int CHANGE_MAIL_OTP = 6;
        int ADD_BANK_ACCO_OTP = 7;
        int FORGET_PASS_OTP = 8;
        int CHANGE_PASS_NOTI = 9;
        int CHANGE_MAIL_NOTI = 10;
        int ADD_BANK_ACCO_NOTI = 11;
        int FORGET_PASS_NOTI = 12;
        int TRANSFER_BANK_NOTI = 13;
        int GREENTRADE_NOTI = 14;
        int CHANGE_PIN_OTP = 15;
        int CASH_TRANS_LOCAL_OTP = 16;
        int REMAKE_ACTIVE_ACCOUNT = 17;
    }

    public interface MsgTemplateSendType {
        int EMAIL = 1;
        int SMS = 2;
        int NOTICE = 3;
    }

    public interface MsgTemplateType {
        int ACTIVE_ACCOUNT = 1;
        int OTP = 2;
        int RESET_PASS_NOTI = 3;
        int RESET_PIN_NOTI = 4;
        int CHANGE_PASS_OTP = 5;
        int CHANGE_MAIL_OTP = 6;
        int ADD_BANK_ACCO_OTP = 7;
        int FORGET_PASS_OTP = 8;
        int CHANGE_PASS_NOTI = 9;
        int CHANGE_MAIL_NOTI = 10;
        int ADD_BANK_ACCO_NOTI = 11;
        int FORGET_PASS_NOTI = 12;
        int TRANSFER_BANK_NOTI = 13;
        int GREENTRADE_NOTI = 14;
        int CHANGE_PIN_OTP = 15;
        int CASH_TRANS_LOCAL_OTP = 16;
        int REMAKE_ACTIVE_ACCOUNT = 17;
    }

    public interface CustomerCustNoType {
        int AUTO_GEN = 1;
        int CHOOSE_NO = 2;
    }

    public interface OtpType {
        int ADD_BANK_ACCO = 1;
        int ACTIVE_ACCO = 2;
        int CHANGE_PASS = 3;
        int CHANGE_EMAIL = 4;
        int FORGET_PASS = 5;
        int CHANGE_PIN = 6;
        int CASH_TRANS_LOCAL = 7;
    }

    public interface OtpSendToType {
        int EMAIL = 1;
        int SMS = 2;
        int ACCO_NUMBER = 3;
    }

    public interface OtpStatus {
        int NOT_USE = 0;
        int USED = 1;
    }

    public interface CustomerPhotoType {
        int ID_FRONT = 1;
        int ID_BACK = 2;
        int SIGNATURE = 3;
    }

    public interface CustomerInfoLink {
        String ACTIVE_ACCO = "https://trading.greenstock.vn/web/active/";
        String IMAGE = "https://trading.greenstock.vn/back/images/";
        String IMAGE_DIR = "C:\\Program Files\\Apache Software Foundation\\Tomcat 8.5\\webapps\\back\\images";
    }
//    public interface CustomerInfoLink {
//        String ACTIVE_ACCO = "https://greenstock.vn/GreenTradeWebCustomer/active/";
//        String IMAGE = "https://www.greenstock.vn/GreenTradeWeb/images/";
//        String IMAGE_DIR = "C:\\Program Files\\Apache Software Foundation\\Tomcat 8.5\\webapps\\back\\images";
//    }

    public interface LenRandomString {
        int OTP_CHANGE_PASS = 6;
        int OTP_CHANGE_MAIL = 6;
        int OTP_CHANGE_PIN = 6;
        int PASSWORD = 8;
        int PINCODE = 6;
        int ADD_BANK_ACCO = 6;
        int FORGET_PASS = 6;
        int PASS_DIRECT = 6;
        int CASH_TRANS_LOCAL = 6;
    }

    public interface OrdRemoteOrderOrderType {
        String LO = "LO";
        String ATC = "ATC";
        String ATO = "ATO";
    }

    public interface LifeTimeOtp {
        Long OTP_GEN = 5 * 60 * 1000L;
        Long REGISTER = 5 * 60 * 60 * 1000L;
    }

    public interface TransferBankFeeType {
        int IN = 1;
        int OUT = 2;
    }

    public interface TransferLocalFeeType {
        int IN = 1;
        int OUT = 2;
    }

    public interface BusinessDateStatus {
        String OPEN = "1";
        String CLOSE = "2";
        String CLOSE_HIST = "3";
    }

    public interface FrontUserStatus {
        int ACTIVE = 1;
        int CLOSED = 9;
        int DELETED = 255;
    }

    public interface CustDevicesPlatform {
        int IOS = 1;
        int ANDROID = 2;
        int WEB = 3;
    }

    public interface CorMoneySourceMoveType {
        int AUTO = 1;
        int MANUAL = 2;
    }
}
