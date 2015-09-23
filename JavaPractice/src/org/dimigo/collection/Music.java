/**
 * 
 */
package org.dimigo.collection;


/**
 * <pre>
 * JavaPractice
 * org.dimigo.collection
 * |_ Music
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * 오후 2:57:03
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class Music {
	private String title;
	private String singer;
	
	public Music(String title, String singer){
		setTitle(title);
		setSinger(singer);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the singer
	 */
	public String getSinger() {
		return singer;
	}

	/**
	 * @param singer the singer to set
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
}
