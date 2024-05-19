package com.kjh.boardback.service;

import com.kjh.boardback.dto.request.recipe_board.PostRecipeCommentRequestDto;
import com.kjh.boardback.dto.request.trade_board.PatchTradeBoardRequestDto;
import com.kjh.boardback.dto.request.trade_board.PostTradeBoardRequestDto;
import com.kjh.boardback.dto.request.trade_board.PostTradeCommentRequestDto;
import com.kjh.boardback.dto.response.recipe_board.PostRecipeCommentResponseDto;
import com.kjh.boardback.dto.response.trade_board.*;
import org.springframework.http.ResponseEntity;

public interface TradeBoardService {

    ResponseEntity<? super GetTradeBoardResponseDto> getTradeBoard(Integer boardNumber);
    ResponseEntity<? super PostTradeBoardResponseDto> postTradeBoard(PostTradeBoardRequestDto requestDto, String email);
    ResponseEntity<? super PatchTradeBoardResponseDto> patchTradeBoard(PatchTradeBoardRequestDto requestDto, String email,Integer boardNumber);
    ResponseEntity<? super DeleteTradeBoardResponseDto> deleteTradeBoard(String email,Integer boardNumber);
    ResponseEntity<? super GetLatestTradeBoardListResponseDto> getTradeBoardList();
    ResponseEntity<? super PostTradeCommentResponseDto> postComment(Integer boardNumber, String email, PostTradeCommentRequestDto dto);
}
