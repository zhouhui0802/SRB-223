package com.atguigu.srb.easyexcel.test;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.atguigu.srb.easyexcel.dto.ExcelStudentDTO;
import com.atguigu.srb.easyexcel.listener.ExcelStudentDTOListener;
import org.junit.Test;

public class ExcelReadTest {

    /**
     * 最简单的读
     */
    @Test
    public void simpleReadXlsx() {

        String fileName = "d:/test.xlsx";
        // 这里默认读取第一个sheet
        EasyExcel.read(fileName, ExcelStudentDTO.class, new ExcelStudentDTOListener()).sheet().doRead();
    }

    @Test
    public void simpleReadXls() {

        String fileName = "d:/excel/simpleWrite.xls";
        EasyExcel.read(fileName, ExcelStudentDTO.class, new ExcelStudentDTOListener()).excelType(ExcelTypeEnum.XLS).sheet().doRead();
    }
}
