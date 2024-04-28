package gb.ru.homeWork4.repository;

import gb.ru.homeWork4.model.Employee;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
public class EmployeeRepositiry {
    List<Employee> employees=new ArrayList<>();

    public void addEmploye(Employee employee){
        employees.add(employee);
    }

}
