package com.whut.stsm.web.service;

import com.whut.stsm.common.dto.UserDTO;

/**
 * Created by null on 2017/2/22.
 */
public interface UserService {

    UserDTO findByUsername(String username);

}
