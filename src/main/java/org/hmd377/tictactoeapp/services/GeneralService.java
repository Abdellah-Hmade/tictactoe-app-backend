package org.hmd377.tictactoeapp.services;

import java.util.List;

public interface GeneralService<ResultVo> {
    
    public ResultVo save(Integer UserId,ResultVo resultVo);

	public ResultVo update(ResultVo resultVo,Integer UserId);

	public void delete(Integer id,Integer UserId);

	public ResultVo get(Integer id,Integer UserId);

	public ResultVo customizedUpdate(Integer notifId);

	public void addToMapFilter(String key,String value);

	public Boolean isMapEmptyFilter();

	public List<ResultVo> getByFilter(Integer UserId);

	public List<ResultVo> getAll(Integer UserId);

	public void addToMapUpdate(String key,String value);

	public Boolean isMapEmptyUpdate();

	public int functionCount(Integer UserId);
}
