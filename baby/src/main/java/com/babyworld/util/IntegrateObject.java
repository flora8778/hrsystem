package com.babyworld.util;
//完成 Employee 与 Department, Position 对象的关联映射
import com.babyworld.domain.Department;
import com.babyworld.domain.Employee;
import com.babyworld.domain.Position;

public class IntegrateObject {
    /**
     * 由于部门和职位在 Employee 中是对象关联映射，
     * 所以不能直接接收参数，需要创建 Department 对象和 Position 对象
     * */
    public static void genericAssociation(Integer dept_id,Integer pos_id,Employee employee){
        Department department = new Department();
        department.setId(dept_id);
        Position position = new Position();
        position.setId(pos_id);
        employee.setDepartment(department);
        employee.setPosition(position);
    }
}