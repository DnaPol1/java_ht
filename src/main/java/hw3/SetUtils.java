package hw3;

import java.util.HashSet;
import java.util.Set;

public class SetUtils {
    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> answer = new HashSet<>(s1);
        answer.addAll(s2);
        return answer;
    }

    public static <E> Set<E> intersection(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> answer = new HashSet<>(s1);
        answer.retainAll(s2);
        return answer;
    }

    public static <E> Set<E> difference(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> answer = new HashSet<>(s1);
        answer.removeAll(s2);
        return answer;
    }

    public static <E> Set<E> symmetricDifference(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> union = union(s1, s2);
        Set<E> intersection = intersection(s1, s2);
        Set<E> answer = new HashSet<>(union);
        answer.removeAll(intersection);
        return answer;
    }
}
