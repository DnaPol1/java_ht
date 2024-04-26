package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Functional {

    public static <T, R> List<R> map(List<T> collection, Function<? super T, ? extends R> function) {
        List<R> answer = new ArrayList<>();
        for (T i : collection) {
            answer.add(function.apply(i));
        }
        return answer;
    }

    public static <T, R> T reduce(List<T> collection, BinaryOperator<T> operator, T identity) {
        T answer = identity;
        for (T i : collection) {
            answer = operator.apply(answer, i);
        }
        return answer;
    }
}




