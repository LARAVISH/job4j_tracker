package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void convertMatrixToList() {
        Integer[][] matrix = {{1, 2}, {3, 4}};
        Matrix matrix1 = new Matrix();
        List<Integer> res = matrix1.convertMatrixToList(matrix);
        assertEquals(res, List.of(1, 2, 3, 4));
    }
}