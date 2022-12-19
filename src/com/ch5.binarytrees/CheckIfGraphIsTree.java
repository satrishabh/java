package com.ch5.binarytrees;

/**
 * Check if a given graph is tree or not
 *
 * Difficulty Level : Medium
 * Last Updated : 01 Aug, 2022
 * Write a function that returns true if a given undirected graph is tree and false otherwise. For example, the following graph is a tree.
 *
 *
 * cycleGraph
 *
 * cycle.
 * Pause
 *
 * Unmute
 * Remaining Time-3:33
 * 1x
 * Playback Rate
 *
 * Captions
 *
 *
 * Picture-in-Picture
 *
 * Fullscreen
 * But the following graph is not a tree.
 *
 *
 * cycleGraph
 *
 * Approach 1:
 *
 * An undirected graph is tree if it has following properties.
 *
 * There is no cycle.
 * The graph is connected.
 * For an undirected graph we can either use BFS or DFS to detect above two properties.
 *
 * How to detect cycle in an undirected graph?
 * We can either use BFS or DFS. For every visited vertex ‘v’, if there is an adjacent ‘u’ such that u is already visited and u is not parent of v, then there is a cycle in graph. If we don’t find such an adjacent for any vertex, we say that there is no cycle (See Detect cycle in an undirected graph for more details).
 *
 * How to check for connectivity?
 * Since the graph is undirected, we can start BFS or DFS from any vertex and check if all vertices are reachable or not. If all vertices are reachable, then graph is connected, otherwise not.
 * Implementation:
 */
public class CheckIfGraphIsTree {
}
