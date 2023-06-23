package com.nabsystem33.streaming.repository;

import com.nabsystem33.streaming.entity.StreamingEntity;
import org.springframework.data.repository.CrudRepository;

public interface StreamingRepo extends CrudRepository<StreamingEntity, Integer> {

}