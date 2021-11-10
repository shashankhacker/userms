package com.calldetails.tel.friend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calldetails.tel.friend.entity.FriendFamily;

public interface FriendFamilyRepository extends JpaRepository<FriendFamily, Integer> {

	List<FriendFamily> getByPhoneNo(Long phoneNo);
}
