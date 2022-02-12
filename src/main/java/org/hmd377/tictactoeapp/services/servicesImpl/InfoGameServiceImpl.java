package org.hmd377.tictactoeapp.services.servicesImpl;

import java.util.List;

import org.hmd377.tictactoeapp.services.InfoGameService;
import org.hmd377.tictactoeapp.vo.InfoGameVo;
import org.springframework.stereotype.Service;
@Service
public class InfoGameServiceImpl implements InfoGameService{

    @Override
    public InfoGameVo save(Integer UserId, InfoGameVo resultVo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public InfoGameVo update(InfoGameVo resultVo, Integer UserId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Integer id, Integer UserId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public InfoGameVo get(Integer id, Integer UserId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public InfoGameVo customizedUpdate(Integer notifId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addToMapFilter(String key, String value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Boolean isMapEmptyFilter() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<InfoGameVo> getByFilter(Integer UserId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<InfoGameVo> getAll(Integer UserId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addToMapUpdate(String key, String value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Boolean isMapEmptyUpdate() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int functionCount(Integer UserId) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
