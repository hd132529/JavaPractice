/**
 * 
 */
package org.dimigo.collection;

import java.util.List;
import java.util.ArrayList;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.collection
 * |_ MelonChart
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * 오후 2:56:50
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class MelonChart {
	public static void main(String[] args){
		
		List<Music> list = new ArrayList<Music>();
		
		list.add(new Music("바람이나 좀 쐐", "개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "iKON"));
		
		System.out.println("-- << 멜론 차트 >> --");
		printList(list);
		System.out.println();
		
		System.out.println("-- << 2위 곡 추가 >> --");
		list.add(1, new Music("레옹", "이유갓지"));
		printList(list);
		System.out.println();
		
		System.out.println("-- << 3위 곡 변경 >> --");
		list.set(2, new Music("맙소사", "황태지"));
		printList(list);
		System.out.println();
		
		System.out.println("-- << 4위 곡 삭제 >> --");
		list.remove(3);
		printList(list);
		System.out.println();
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		list.clear();
		printList(list);
	}
	
	public static void printList(List<Music> list){
		int i = 0;
		for(Music music : list){
			System.out.println((++i) + ". " + music);
		}
	}
}