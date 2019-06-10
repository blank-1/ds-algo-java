# ds-algo-java

数据结构和算法必知必会的 50 个代码实现（Java）

## 数组

* 实现一个支持动态扩容的数组
* 实现一个大小固定的有序数组，支持动态增删改操作
* 实现两个有序数组合并为一个有序数组

## 链表

* 实现单链表、循环链表、双向链表，支持增删操作
* 实现单链表反转
* 实现两个有序的链表合并为一个有序链表
* 实现求链表的中间结点

## 栈

* 用数组实现一个顺序栈
* 用链表实现一个链式栈
* 编程模拟实现一个浏览器的前进、后退功能

## 队列

* 用数组实现一个顺序队列
* 用链表实现一个链式队列
* 实现一个循环队列

## 递归

* 编程实现斐波那契数列求值f(n)=f(n-1)+f(n-2)
* 编程实现求阶乘n!
* 编程实现一组数据集合的全排列

## 排序

* 实现 [归并排序][MergeSort]、[快速排序][QuickSort]、[插入排序][InsertionSort]、[冒泡排序][BubbleSort]、选择排序
* 编程实现O(n)时间复杂度内找到一组数据的第K大元素

[MergeSort]: https://github.com/andavid/ds-algo-java/blob/master/src/main/java/com/github/andavid/ds/basic/sort/MergeSort.java
[QuickSort]: https://github.com/andavid/ds-algo-java/blob/master/src/main/java/com/github/andavid/ds/basic/sort/QuickSort.java
[BubbleSort]: https://github.com/andavid/ds-algo-java/blob/master/src/main/java/com/github/andavid/ds/basic/sort/BubbleSort.java
[InsertionSort]: https://github.com/andavid/ds-algo-java/blob/master/src/main/java/com/github/andavid/ds/basic/sort/InsertionSort.java

## 二分查找

* [实现一个有序数组的二分查找算法][binary-search]
* [实现模糊二分查找算法（比如大于等于给定值的第一个元素）][binary-search]

[binary-search]: https://github.com/andavid/ds-algo-java/blob/master/src/main/java/com/github/andavid/ds/basic/search/BinarySearch.java

## 散列表

* 实现一个基于链表法解决冲突问题的散列表
* 实现一个LRU缓存淘汰算法

## 字符串

* 实现一个字符集，只包含a～z这26个英文字母的Trie树
* 实现朴素的字符串匹配算法

## 二叉树

* 实现一个二叉查找树，并且支持插入、删除、查找操作
* 实现查找二叉查找树中某个节点的后继、前驱节点
* 实现二叉树前、中、后序以及按层遍历

## 堆

* 实现一个小顶堆、大顶堆、优先级队列
* 实现堆排序
* 利用优先级队列合并K个有序数组
* 求一组动态数据集合的最大Top K

## 图

* 实现有向图、无向图、有权图、无权图的邻接矩阵和邻接表表示方法
* 实现图的深度优先搜索、广度优先搜索
* 实现Dijkstra算法、A*算法
* 实现拓扑排序的Kahn算法、DFS算法

## 回溯

* [利用回溯算法求解八皇后问题][EightQueen]
* [利用回溯算法求解 0-1 背包问题][Package]

[EightQueen]: https://github.com/andavid/ds-algo-java/blob/master/src/main/java/com/github/andavid/ds/algorithm/backtracking/EightQueen.java
[Package]: https://github.com/andavid/ds-algo-java/blob/master/src/main/java/com/github/andavid/ds/algorithm/backtracking/Package.java

## 分治

* 利用分治算法求一组数据的逆序对个数

## 动态规划

* 0-1背包问题
* 最小路径和
* 编程实现莱文斯坦最短编辑距离
* 编程实现查找两个字符串的最长公共子序列
* 编程实现一个数据序列的最长递增子序列
