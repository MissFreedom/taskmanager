package com.missfreedom.taskmanager.service.impl;

import com.missfreedom.taskmanager.model.TaskDO;
import com.missfreedom.taskmanager.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/**
 * author: JinBingBing
 * description: 定时任务服务实现
 * time: 2017/1/22 16:57.
 */
@Service
public class TaskServiceImpl implements TaskService {

    private static final Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);

    @Resource
    public TaskScheduler poolTaskScheduler;

    /**
     * 添加定时任务服务实现信息
     *
     * @param taskDO
     * @return
     * @throws Exception
     */
    public boolean addTask(TaskDO taskDO) throws Exception {
        try {

            return true;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    /**
     * 修改定时任务服务实现信息
     *
     * @param taskDO
     * @return
     * @throws Exception
     */
    public boolean modifyTask(TaskDO taskDO) throws Exception {
        try {
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    /**
     * 删除定时任务服务实现信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    public boolean removeTask(String id) throws Exception {
        return false;
    }

    /**
     * 根据id获取定时任务服务实现信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    public TaskDO getTaskById(String id) throws Exception {
        return null;
    }

    /**
     * 获取所有定时任务服务实现信息
     *
     * @return
     * @throws Exception
     */
    public List<TaskDO> getTaskList() throws Exception {
        return null;
    }

    /**
     * 查询定时任务服务实现信息
     *
     * @param query
     * @return
     */
    public List<TaskDO> queryTask(TaskDO query) throws Exception {
        return null;
    }

    /**
     * 分页查询定时任务服务实现信息
     *
     * @param query
     * @param pageRequest
     * @return
     */
//    public PageRequest<TaskDO> queryTaskByPage(TaskDO query, PageRequest<TaskDO> pageRequest) throws Exception {
//        return null;
//    }
}
