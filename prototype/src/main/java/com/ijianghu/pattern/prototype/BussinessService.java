package com.ijianghu.pattern.prototype;

import cn.hutool.core.bean.BeanUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kai on
 * @date 2019/3/12 11:19
 */
public class BussinessService {

    public List<ExamGroupStrategyVO> getStrategies(Integer cycleId, Integer type){
        List<ExamGroupStrategy> examGroupStrategies = new ArrayList<>();
        List<ExamGroupStrategyVO> examGroupStrategyVOS = new ArrayList<>();
        ExamGroupStrategyVO strategyVO = null;
        int rowNum = 1;
        for (ExamGroupStrategy examGroupStrategie: examGroupStrategies) {
            strategyVO = new ExamGroupStrategyVO();
            BeanUtil.copyProperties(examGroupStrategie,strategyVO);
            strategyVO.setRowNum(rowNum);
            examGroupStrategyVOS.add(strategyVO);
            rowNum++;
        }
        return examGroupStrategyVOS;
    }

}
