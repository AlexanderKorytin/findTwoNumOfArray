// интерфейс работы с массивом с методами сортировки и реализации некого решения
package src;

public interface SortArrays<T> {
    T[] sort(T[] mass);

    T[] searchResult(T[] mass, T t);
}
