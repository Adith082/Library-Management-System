package com.example.libraryManagementSystem.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TypeController {
    @Autowired
    private TypeService typeService;

    @RequestMapping("/admin/types")
    public List<Type> getAllTypes(){
        return typeService.getAllTypes();
    }

    @RequestMapping("/admin/types/{id}")
    public Type getTypeById(@PathVariable String id){
        return typeService.getTypeById(id);
    }


    @RequestMapping(method = RequestMethod.POST, value="/admin/types")
    public void addType(@RequestBody Type type){
        typeService.addType(type);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/admin/types/{id}")
    public void updateType(@RequestBody Type type, @PathVariable String id){
        typeService.updateType(type, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/admin/types/{id}")
    public void deleteType(@RequestBody Type type, @PathVariable String id){
        typeService.deleteType(id);
    }






}
