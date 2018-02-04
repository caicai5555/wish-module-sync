package com.foundation.dao.modules;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.foundation.common.persistence.Page;
/**
 * 
* @ClassName: MybatisBaseDao 
* @Description: Mybatis基础Dao
* @author fqh 
* @date 2015年12月14日
* 
* @param <KEY>
* @param <T>
 */
@Repository
public interface MybatisBaseDaoSync<KEY, T> {
	
    /**
     *
    * @Title: queryObject
    * @Description: 根据参数获取实体
    * @author fqh
    * @date 2016年10月12日
    * @param @param params
    * @param @return    设定参数
    * @return T    实体
    * @throws
     */
    @SuppressWarnings("rawtypes")
    public T queryObject(Map params);

    /**
     *
     * @Title: queryById
     * @Description: 根据id获取实体
     * @author fqh
     * @date 2016年10月12日
     * @param @param id 主键
     * @param @return    设定参数
     * @return T    实体
     * @throws
     */
    public T queryById(KEY id);

    /**
     *
     * @Title: queryById
     * @Description: 根据id获取实体
     * @author fqh
     * @date 2016年10月12日
     * @param @param id 主键
     * @param @return    设定参数
     * @return T    实体
     * @throws
     */
    public T queryById(Map<String,Object> params);

    @SuppressWarnings("rawtypes")
    public List<T> queryPage(@Param("map")Map params,@Param("page") Page<T> pageBounds);
    
    /**
     * 
    * @Title: queryList 
    * @Description: 根据参数获取列表数据
    * @author fqh
    * @date 2016年10月12日 上午10:11:38 
    * @param @param params
    * @param @return    设定参数 
    * @return List<T>    实体列表
    * @throws
     */
    @SuppressWarnings("rawtypes")
    public List<T> queryList(Map params);
    
    /**
     * 
    * @Title: update 
    * @Description: 更新实体
    * @author chengchen
    * @date 2016年10月12日 上午10:14:15 
    * @param @param t    设定参数 
    * @return void    无返回
    * @throws
     */
    public void update(T t);

    /**
     * @Title:
     * @Description: 更新实体入参Map
     * @author SamWang
     * @date 2016/10/17 9:15
     * @param     
     * @return    
     * @throws 
     */
    @SuppressWarnings("rawtypes")
	public Integer updateByMap(Map params);
    
    /**
     * 
    * @Title: save 
    * @Description: 保存实体
    * @author fqh
    * @date 2016年10月12日 上午10:14:47 
    * @param @param t
    * @param @return    设定参数 
    * @return Long    
    * @throws
     */
    public Long save(T t);
    
    /**
     * 
    * @Title: batchUpdate 
    * @Description: 批量更新
    * @author fqh
    * @date 2016年10月12日 上午10:16:28 
    * @param @param list    实体列表 
    * @return void    无返回
    * @throws
     */
    public void batchUpdate(List<T> list);
    
    /**
     * 
    * @Title: batchSave 
    * @Description: 批量保存
    * @author chengchen
    * @date 2016年10月12日 上午10:17:13 
    * @param @param list    实体列表
    * @return void    无返回 
    * @throws
     */
    public void batchSave(List<T> list);

    @SuppressWarnings("rawtypes")
    public void batchSaveMap(Map mapList);
    
    /**
     * 
    * @Title: getCount 
    * @Description: 获取数量
    * @author chengchen
    * @date 2016年10月12日 上午10:07:38 
    * @param @param params
    * @param @return    设定参数 
    * @return int    数量
    * @throws
     */
    @SuppressWarnings("rawtypes")
	public int getCount(Map params);
    
    /**
     * 
    * @Title: delete 
    * @Description: 删除实体
    * @author chengchen
    * @date 2016年10月12日 上午10:21:19 
    * @param @param id    实体主键
    * @return void    无返回
    * @throws
     */
    public void delete(KEY id);
    
    /**
     * 
    * @Title: deleteByMap 
    * @Description: 根据map删除实体
    * @author chengchen
    * @date 2016年11月22日 下午4:13:54 
    * @param @param params    设定参数 
    * @return void    返回类型 
    * @throws
     */
    @SuppressWarnings("rawtypes")
	public void deleteByMap(Map params);
}
