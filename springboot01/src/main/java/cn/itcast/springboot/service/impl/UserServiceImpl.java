package cn.itcast.springboot.service.impl;

import org.springframework.stereotype.Service;

import cn.itcast.springboot.service.UserService;

/**
 * UserServiceImpl
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 上午9:59:18
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public void save() {
		System.out.println("=======save=======");
	}

}
