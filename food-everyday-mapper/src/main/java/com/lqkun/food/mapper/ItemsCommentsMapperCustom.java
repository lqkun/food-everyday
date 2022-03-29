package com.lqkun.food.mapper;
import com.lqkun.food.my.mapper.MyMapper;
import com.lqkun.food.pojo.ItemsComments;
import com.lqkun.food.pojo.vo.MyCommentVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ItemsCommentsMapperCustom extends MyMapper<ItemsComments> {

    public void saveComments(Map<String, Object> map);

    public List<MyCommentVO> queryMyComments(@Param("paramsMap") Map<String, Object> map);

}