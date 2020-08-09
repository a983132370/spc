package com.cloud.common.dto;

/**
 * @ClassName:
 * @Description:
 * @Author zhu
 * @Date 2018/8/14 15:48
 */
public enum ResCode {

    DEMAND_STATUS_ERROR(1015,"需求状态错误"),
    CONFIGKEY_EXIST(1014,"配置键名已存在"),
    ROLE_CONCAT_USER_ERROR(1013,"{0} 已分配,不能删除"),
    ROLEKEY_EXIST(1012,"角色权限已存在"),
    ROLENAME_EXIST(1011,"角色名称已存在"),
    EMAIL_EXIST(1010,"邮箱已存在"),
    PHONE_EXIST(1009,"手机号已存在"),
    USERNAME_EXIST(1008,"用户名已存在"),
    MENU_CONCAT_ROLE_ERROR(1007,"菜单已分配,不允许删除"),
    MENU_HAS_CHILD_ERROR(1006,"存在子菜单,不允许删除"),
    DATA_NOT_EXIST(1005,"数据不存在!"),
    DATA_AL_EXIST(1004,"数据已存在!"),
    PASSWORD_OR_ACCOUNT_ERROR(1003,"帐号或密码错误"),
    ADMIN_NOT_EXIST(1002,"管理用户不存在"),
    VERIFICATION_CODE_ERROR(1001,"验证码已失效!"),
    REQ_METHOD_NOT_SUPPORT(405,"请求方式错误!"),
    NOT_FOUND(404,"路径不存在，请检查路径是否正确"),
    PERMISSION_ERROR(403,"用户没有权限"),
    USER_NOT_LOGIN(401,"请先登录"),
    PARAMS_ERROR(400,"参数错误"),
    ERROR(9999,"服务器错误");

    //错误码
    private Integer code;
    //错误消息
    private String msg;
    //构造函数
    ResCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

