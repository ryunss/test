package com.koreait.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReplyPageDTO {
	int replyCnt;
	List<ReplyDTO> list;
}
