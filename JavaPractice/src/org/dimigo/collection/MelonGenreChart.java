/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.collection
 * |_ MelonGenreChart
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 30.
 * 오후 2:57:41
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()){
			System.out.println("[" + key + "]");
			for(int i=1;i<=map.get(key).size();i++)
				
				System.out.println(i + ". "+ map.get(key).get(i-1).toString());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<Music>> map = new HashMap<String,List<Music>>();
		
		List<Music> ballad = new ArrayList<Music>();
		
		ballad.add(new Music("내 첫사랑","베리굿"));
		ballad.add(new Music("또 다시 사랑","임창정"));
		ballad.add(new Music("부산에 가면","박진영"));
		map.put("발라드",ballad);
		
		List<Music> dance = new ArrayList<Music>();
		
		dance.add(new Music("커피","유재환,김예림"));
		dance.add(new Music("다 잘될거야","쿨"));
		map.put("댄스", dance);
		System.out.println("---- << 멜론 장르별 차트 >> ----");
		printMap(map);
		
		System.out.println("---- << 발라드 3위 곡 변경 >> ----");
		map.get("발라드").set(2, new Music("지우고 지워도","차수경"));
		printMap(map);
		
		System.out.println("---- << 발라드 1위 곡 삭제 >> ----");
		map.get("발라드").remove(0);
		printMap(map);
		System.out.println("---- << 전체 리스트 삭제 >> ----");
		for(List<Music> music : map.values()){
			music.clear();
		}
		map.clear();
	}

}