package edu.seoyun.manage.controller;

import edu.seoyun.manage.domain.Board;
import edu.seoyun.manage.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final BoardService boardService;

    @GetMapping("/hihi")
    public String hihi(Model model, @RequestParam Long id) {

        Board board = boardService.getBoard(id);
        model.addAttribute("board", board);
        return "hihi";
    }

}
