package com.myhome.Myhome.service;

import com.myhome.Myhome.model.Board;
import com.myhome.Myhome.model.User;
import com.myhome.Myhome.repository.BoardRepository;
import com.myhome.Myhome.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {


    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username,Board board){
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);

    }

}
