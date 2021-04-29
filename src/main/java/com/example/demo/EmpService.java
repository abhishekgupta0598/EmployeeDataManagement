/*package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmpService {

    @Autowired
    EmpRepository repository;

    public List<EmpData> getData(){
        List<EmpData> list = new ArrayList<EmpData>();
        repository.findAll().forEach(list::add);
        return list;
    }

    //public EmpData getId(String id){
      //  return repository.findById(id);
    //}

    public void addData(EmpData value){
        repository.save(value);
    }

    public void updateData(EmpData value, String id){
        repository.save(value);
    }

    public void deleteData(String id){
        repository.deleteById(id);
    }
}
*/