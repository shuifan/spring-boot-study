package com.example.flowable;

import lombok.Data;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author fandong
 * @create 2019/1/29
 */
@Data
public class NextUserId {

    private List<String> userIds;

    private AtomicInteger index;

    public NextUserId(List<String> userIds) {
        if (userIds == null || userIds.isEmpty()){
            throw new NullPointerException("不可传入空集合");
        }
        this.userIds = userIds;
        this.index = new AtomicInteger(0);
    }

    public String get(){
        int index = this.index.getAndIncrement();
        if (index == userIds.size()){
            return "";
        }
        return userIds.get(index);
    }

    public boolean allGetted(){
        return index.get() == userIds.size();
    }


}
