package com.heanbian.email;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * 邮件消息类
 * 
 * @author heanbian@heanbian.com
 * @since 1.0
 * @version 1.0
 */
public class HeanbianEmailMessage {

	/**
	 * 主题
	 */
	private String subject;

	/**
	 * 接收人邮件地址
	 */
	private List<String> toAddress;

	/**
	 * 抄送人邮件地址
	 */
	private List<String> ccAddress;

	/**
	 * 密送人邮件地址
	 */
	private List<String> bccAddress;

	/**
	 * 附件，Internet URLs
	 */
	private List<String> attachments;

	/**
	 * 附件，Local files
	 */
	private List<File> files;

	/**
	 * 正文内容
	 */
	private String content;

	public HeanbianEmailMessage() {
	}

	/**
	 * 消息体
	 * 
	 * @param subject   {@link #subject}
	 * @param toAddress {@link #toAddress}
	 * @param content   {@link #content}
	 */
	public HeanbianEmailMessage(String subject, String toAddress, String content) {
		this(subject, Arrays.asList(toAddress), null, null, null, null, content);
	}

	/**
	 * 消息体
	 * 
	 * @param subject   {@link #subject}
	 * @param toAddress {@link #toAddress}
	 * @param content   {@link #content}
	 */
	public HeanbianEmailMessage(String subject, List<String> toAddress, String content) {
		this(subject, toAddress, null, null, null, null, content);
	}

	/**
	 * 消息体
	 * 
	 * @param subject     {@link #subject}
	 * @param toAddress   {@link #toAddress}
	 * @param ccAddress   {@link #ccAddress}
	 * @param bccAddress  {@link #bccAddress}
	 * @param attachments {@link #attachments}
	 * @param files       {@link #files}
	 * @param content     {@link #content}
	 */
	public HeanbianEmailMessage(String subject, List<String> toAddress, List<String> ccAddress, List<String> bccAddress,
			List<String> attachments, List<File> files, String content) {
		this.subject = subject;
		this.toAddress = toAddress;
		this.ccAddress = ccAddress;
		this.bccAddress = bccAddress;
		this.attachments = attachments;
		this.files = files;
		this.content = content;
	}

	/**
	 * @return {@link #subject}
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject {@link #subject}
	 * @return this
	 */
	public HeanbianEmailMessage setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	/**
	 * @return {@link #toAddress}
	 */
	public List<String> getToAddress() {
		return toAddress;
	}

	/**
	 * @param toAddress {@link #toAddress}
	 * @return this
	 */
	public HeanbianEmailMessage setToAddress(List<String> toAddress) {
		this.toAddress = toAddress;
		return this;
	}

	/**
	 * @return {@link #ccAddress}
	 */
	public List<String> getCcAddress() {
		return ccAddress;
	}

	/**
	 * @param ccAddress {@link #ccAddress}
	 * @return this
	 */
	public HeanbianEmailMessage setCcAddress(List<String> ccAddress) {
		this.ccAddress = ccAddress;
		return this;
	}

	/**
	 * @return {@link #bccAddress}
	 */
	public List<String> getBccAddress() {
		return bccAddress;
	}

	/**
	 * @param bccAddress {@link #bccAddress}
	 * @return this
	 */
	public HeanbianEmailMessage setBccAddress(List<String> bccAddress) {
		this.bccAddress = bccAddress;
		return this;
	}

	/**
	 * @return {@link #attachments}
	 */
	public List<String> getAttachments() {
		return attachments;
	}

	/**
	 * @param attachments {@link #attachments}
	 * @return this
	 */
	public HeanbianEmailMessage setAttachments(List<String> attachments) {
		this.attachments = attachments;
		return this;
	}

	/**
	 * @return {@link #files}
	 */
	public List<File> getFiles() {
		return files;
	}

	/**
	 * @param files {@link #files}
	 * @return this
	 */
	public HeanbianEmailMessage setFiles(List<File> files) {
		this.files = files;
		return this;
	}

	/**
	 * @return {@link #content}
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content {@link #content}
	 * @return this
	 */
	public HeanbianEmailMessage setContent(String content) {
		this.content = content;
		return this;
	}

}