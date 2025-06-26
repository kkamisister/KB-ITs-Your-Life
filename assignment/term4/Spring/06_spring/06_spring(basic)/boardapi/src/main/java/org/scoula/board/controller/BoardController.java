package org.scoula.board.controller;

import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/board")
@RequiredArgsConstructor
@Log4j2

@RestController
@Api(tags = "게시글 관리")
public class BoardController {

private final BoardService service;//생성자 주입

    @ApiOperation(value = "게시글 목록", notes = "게시글 목록을 얻는 API")
    @GetMapping("")


    public ResponseEntity<List<BoardDTO>> getList(){
        return ResponseEntity.ok(service.getList());
    }

    @GetMapping("/get")
    public BoardDTO get(@RequestParam("no") Long no){
        return service.get(no);
    }

    @ApiOperation(value = "상세정보얻기", notes = "게시글상제정보를얻는API")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "성공적으로요청이처리되었습니다.", response = BoardDTO.class),
            @ApiResponse(code = 400, message = "잘못된요청입니다."),
            @ApiResponse(code = 500, message = "서버에서오류가발생했습니다.")
    })
    @GetMapping("/get/{no}")
    public BoardDTO get2(
            @ApiParam(value = "게시글 ID", required = true, example = "1")
            @PathVariable Long no){
        return service.get(no);
    }

    @PostMapping("")
    public ResponseEntity<BoardDTO> create(@RequestBody BoardDTO dto){


        return ResponseEntity.ok(service.create(dto));
    }

}
