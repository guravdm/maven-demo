package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.domain.RequestDomain;

@RepositoryRestController
public interface IRequest extends JpaRepository<RequestDomain, Long> {

}
