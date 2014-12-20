/**
 * 
 */
package mblog.core.persist.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author langhsu
 *
 */
@Entity
@Table(name = "tb_mblog")
public class MblogPO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String type;
	private String title;  // 标题
	private String summary;  // 摘要
	private String content;  // 内容
	private String tags;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "snapshot_id")
	private AttachPO snapshot;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date created;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date updated;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id")
	private UserPO author;
	
	private int featured; // 是否推荐
	private int hearts;     // 喜欢
	private int comments;
	private int views;     // 阅读
	private int status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public AttachPO getSnapshot() {
		return snapshot;
	}

	public void setSnapshot(AttachPO snapshot) {
		this.snapshot = snapshot;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public UserPO getAuthor() {
		return author;
	}

	public void setAuthor(UserPO author) {
		this.author = author;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getFeatured() {
		return featured;
	}

	public void setFeatured(int featured) {
		this.featured = featured;
	}

	public int getHearts() {
		return hearts;
	}

	public void setHearts(int hearts) {
		this.hearts = hearts;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

}