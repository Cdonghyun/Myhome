package com.myhome.Myhome.repsitory;

import com.myhome.Myhome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BoardRepository extends JpaRepository<Board, Long> {
}
