package cn.st.domain;

/**
 * @description:
 * @author: st
 * @create: 2021-02-07 15:40
 **/

public class Role {
    private int id;
    private String roleName;
    private String roleDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                '}';
    }
}


//    CREATE TABLE `sys_role` (
//        `id` int NOT NULL AUTO_INCREMENT,
//        `rolename` varchar(255) DEFAULT NULL,
//        `roleDesc` varchar(255) DEFAULT NULL,
//        PRIMARY KEY (`id`)
//        ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;