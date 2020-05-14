package com.corejava.com.corejava.aarna;

import java.util.*;
import java.util.stream.Stream;

public class AarnasFirstClass {

    public static void main(String args[]) {

        AarnasFirstClass aa = new AarnasFirstClass();

        Employee emp1 = new Employee("Neeraj1", "nxgidha1", "Girdhar1", "1", "1");
        Employee emp2 = new Employee("Neeraj2", "nxgidha2", "Girdhar2", "2", "2");
        Employee emp3 = new Employee("Neeraj3", "nxgidha3", "Girdhar3", "3", "3");
        Employee emp4 = new Employee("Neeraj4", "nxgidha4", "Girdhar4", "4", "4");
        Employee emp5 = new Employee("Neeraj5", "nxgidha5", "Girdhar5", "5", "5");
        Employee emp6 = new Employee("Neeraj6", "nxgidha6", "Girdhar6", "6", "6");

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);

        Department dep1 = new Department("Finance1", "1", "Chandigarh");
        Department dep2 = new Department("Finance2", "2", "Gurgaon");
        Department dep3 = new Department("Finance3", "3", "Delhi");
        Department dep4 = new Department("Finance4", "4", "Banglore");
        Department dep5 = new Department("Finance5", "5", "Bombay");
        Department dep6 = new Department("Finance6", "6", "Chennai");

        List<Department> departments = new ArrayList<>();
        departments.add(dep1);
        departments.add(dep2);
        departments.add(dep3);
        departments.add(dep4);
        departments.add(dep5);
        departments.add(dep6);

       aa.merge(employees,"departmentid",departments,"depid","departmentlocation");
        employees.forEach(item->{
          System.out.println(item.getFname()+"::"+item.getLname()+"::"+item.getLoginid()+"::"+item.getLocation()+"::"+item.getEmpid()+"::"+item.getDepartmentid());
        }
    );
}

    private void merge(List<Employee> parentList1, String parentMergeKey,List<Department> childlist2, String childMergeKey, String mergedFields) {
        List list = new ArrayList();
        Map<String, Department> childMap;

        childMap = convertMap(childlist2,childMergeKey);
        parentList1.forEach(item->{
            if (parentMergeKey.equalsIgnoreCase("departmentid")) {
                Department department = childMap.get(item.getDepartmentid());

                if(mergedFields.equalsIgnoreCase("departmentlocation"))
                {
                    item.setLocation(department.getDepartmentlocation());
                }

            }
        });

    }

    private Map<String, Department> convertMap(List<Department> childlist2, String mergeCriteria) {
        Map<String,Department> linkedHmap = new LinkedHashMap<>();

        if (mergeCriteria.equalsIgnoreCase("depid")) {
            childlist2.forEach(item -> linkedHmap.put(item.getDepid(),item));

        }
        if (mergeCriteria.equalsIgnoreCase("departmentname")) {
            childlist2.forEach(item -> linkedHmap.put(item.getDepartmentname(),item));
        }
        if (mergeCriteria.equalsIgnoreCase("departmentlocation")) {
            childlist2.forEach(item -> linkedHmap.put(item.getDepartmentlocation(),item));
        }
    return linkedHmap;
    }
}