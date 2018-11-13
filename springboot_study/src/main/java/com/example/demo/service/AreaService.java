package com.example.demo.service;

import com.example.demo.entity.Area;

import java.util.List;

public interface AreaService {

    List<Area> queryArea();
    Area queryAreaById(int areaId);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int areaId);


}
