package com.missfreedom.taskmanager.service;

import com.missfreedom.taskmanager.model.TaskDO;

import java.util.List;

/**
 * author: JinBingBing
 * description: 定时任务服务
 * time: 2017/1/22 16:55.
 */

public interface TaskService {

    /**
     * 添加定时任务服务信息
     *
     * @param taskDO
     * @return
     * @throws Exception
     */
    boolean addTask(TaskDO taskDO) throws Exception;

    /**
     * 修改定时任务服务信息
     *
     * @param taskDO
     * @return
     * @throws Exception
     */
    boolean modifyTask(TaskDO taskDO) throws Exception;

    /**
     * 删除定时任务服务信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean removeTask(String id) throws Exception;

    /**
     * 根据id获取定时任务服务信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    TaskDO getTaskById(String id) throws Exception;

    /**
     * 查询定时任务服务信息
     *
     * @param query
     * @return
     */
    List<TaskDO> queryTask(TaskDO query) throws Exception;

    /**
     * 分页查询定时任务服务信息
     *
     * @param query
     * @param pageRequest
     * @return
     */
//    PageRequest<TaskDO> queryTaskByPage(TaskDO query, PageRequest<TaskDO> pageRequest) throws Exception;
}
