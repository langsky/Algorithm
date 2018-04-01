package top.aiboom.algorithm.sort

/**
 * Created by hgl on 2018/4/1.
 * 可比较接口,所有可比较的对象都需要实现该接口
 * 实现量化的方式有两种，一种是
 */
interface CompareObject<in T> {

    //可比较对象需要实现自己大小的量化，比如Unicode协会的[校对算法]
    fun cmpValue(): Int

    operator fun compareTo(other: T): Int
}