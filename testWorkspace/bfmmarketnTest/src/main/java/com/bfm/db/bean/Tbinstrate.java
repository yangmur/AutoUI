package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * Tbinstrate generated by hbm2java
 */
public class Tbinstrate implements java.io.Serializable {

	private TbinstrateId id;
	private BigDecimal ruleNormalNo;
	private BigDecimal ruleOverdueNo;
	private BigDecimal ruleTermNo;
	private BigDecimal ruleTermRemainNo;
	private BigDecimal ruleCompoundNo;
	private String interestCcy;
	private String interestMode;
	private String payFreq;
	private String resetFreq;
	private String isAdjust;
	private String holiday;
	private String dateAdjustMethod;
	private BigDecimal paymentOffset;
	private String isMonthEnd;
	private String upfrontOrArrears;
	private BigDecimal firstPaydate;
	private BigDecimal lastPayDate;
	private String compdMethod;
	private String isResetCombine;
	private String payBasis;
	private BigDecimal aheadAsNormal;
	private String isInterestBal;
	private String reserve;
	private String reserve2;
	private String reserve3;
	private BigDecimal lastDate;
	private BigDecimal lastTime;

	public Tbinstrate() {
	}

	public Tbinstrate(TbinstrateId id, BigDecimal ruleNormalNo,
			BigDecimal ruleOverdueNo, BigDecimal ruleTermNo,
			BigDecimal ruleTermRemainNo, BigDecimal ruleCompoundNo,
			String interestCcy, String interestMode, String payFreq,
			String resetFreq, String isAdjust, String holiday,
			String dateAdjustMethod, BigDecimal paymentOffset,
			String isMonthEnd, String upfrontOrArrears,
			BigDecimal firstPaydate, BigDecimal lastPayDate,
			String compdMethod, String isResetCombine, String payBasis,
			BigDecimal aheadAsNormal, String isInterestBal, String reserve,
			String reserve2, String reserve3, BigDecimal lastDate,
			BigDecimal lastTime) {
		this.id = id;
		this.ruleNormalNo = ruleNormalNo;
		this.ruleOverdueNo = ruleOverdueNo;
		this.ruleTermNo = ruleTermNo;
		this.ruleTermRemainNo = ruleTermRemainNo;
		this.ruleCompoundNo = ruleCompoundNo;
		this.interestCcy = interestCcy;
		this.interestMode = interestMode;
		this.payFreq = payFreq;
		this.resetFreq = resetFreq;
		this.isAdjust = isAdjust;
		this.holiday = holiday;
		this.dateAdjustMethod = dateAdjustMethod;
		this.paymentOffset = paymentOffset;
		this.isMonthEnd = isMonthEnd;
		this.upfrontOrArrears = upfrontOrArrears;
		this.firstPaydate = firstPaydate;
		this.lastPayDate = lastPayDate;
		this.compdMethod = compdMethod;
		this.isResetCombine = isResetCombine;
		this.payBasis = payBasis;
		this.aheadAsNormal = aheadAsNormal;
		this.isInterestBal = isInterestBal;
		this.reserve = reserve;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
		this.lastDate = lastDate;
		this.lastTime = lastTime;
	}

	public TbinstrateId getId() {
		return this.id;
	}

	public void setId(TbinstrateId id) {
		this.id = id;
	}

	public BigDecimal getRuleNormalNo() {
		return this.ruleNormalNo;
	}

	public void setRuleNormalNo(BigDecimal ruleNormalNo) {
		this.ruleNormalNo = ruleNormalNo;
	}

	public BigDecimal getRuleOverdueNo() {
		return this.ruleOverdueNo;
	}

	public void setRuleOverdueNo(BigDecimal ruleOverdueNo) {
		this.ruleOverdueNo = ruleOverdueNo;
	}

	public BigDecimal getRuleTermNo() {
		return this.ruleTermNo;
	}

	public void setRuleTermNo(BigDecimal ruleTermNo) {
		this.ruleTermNo = ruleTermNo;
	}

	public BigDecimal getRuleTermRemainNo() {
		return this.ruleTermRemainNo;
	}

	public void setRuleTermRemainNo(BigDecimal ruleTermRemainNo) {
		this.ruleTermRemainNo = ruleTermRemainNo;
	}

	public BigDecimal getRuleCompoundNo() {
		return this.ruleCompoundNo;
	}

	public void setRuleCompoundNo(BigDecimal ruleCompoundNo) {
		this.ruleCompoundNo = ruleCompoundNo;
	}

	public String getInterestCcy() {
		return this.interestCcy;
	}

	public void setInterestCcy(String interestCcy) {
		this.interestCcy = interestCcy;
	}

	public String getInterestMode() {
		return this.interestMode;
	}

	public void setInterestMode(String interestMode) {
		this.interestMode = interestMode;
	}

	public String getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(String payFreq) {
		this.payFreq = payFreq;
	}

	public String getResetFreq() {
		return this.resetFreq;
	}

	public void setResetFreq(String resetFreq) {
		this.resetFreq = resetFreq;
	}

	public String getIsAdjust() {
		return this.isAdjust;
	}

	public void setIsAdjust(String isAdjust) {
		this.isAdjust = isAdjust;
	}

	public String getHoliday() {
		return this.holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public String getDateAdjustMethod() {
		return this.dateAdjustMethod;
	}

	public void setDateAdjustMethod(String dateAdjustMethod) {
		this.dateAdjustMethod = dateAdjustMethod;
	}

	public BigDecimal getPaymentOffset() {
		return this.paymentOffset;
	}

	public void setPaymentOffset(BigDecimal paymentOffset) {
		this.paymentOffset = paymentOffset;
	}

	public String getIsMonthEnd() {
		return this.isMonthEnd;
	}

	public void setIsMonthEnd(String isMonthEnd) {
		this.isMonthEnd = isMonthEnd;
	}

	public String getUpfrontOrArrears() {
		return this.upfrontOrArrears;
	}

	public void setUpfrontOrArrears(String upfrontOrArrears) {
		this.upfrontOrArrears = upfrontOrArrears;
	}

	public BigDecimal getFirstPaydate() {
		return this.firstPaydate;
	}

	public void setFirstPaydate(BigDecimal firstPaydate) {
		this.firstPaydate = firstPaydate;
	}

	public BigDecimal getLastPayDate() {
		return this.lastPayDate;
	}

	public void setLastPayDate(BigDecimal lastPayDate) {
		this.lastPayDate = lastPayDate;
	}

	public String getCompdMethod() {
		return this.compdMethod;
	}

	public void setCompdMethod(String compdMethod) {
		this.compdMethod = compdMethod;
	}

	public String getIsResetCombine() {
		return this.isResetCombine;
	}

	public void setIsResetCombine(String isResetCombine) {
		this.isResetCombine = isResetCombine;
	}

	public String getPayBasis() {
		return this.payBasis;
	}

	public void setPayBasis(String payBasis) {
		this.payBasis = payBasis;
	}

	public BigDecimal getAheadAsNormal() {
		return this.aheadAsNormal;
	}

	public void setAheadAsNormal(BigDecimal aheadAsNormal) {
		this.aheadAsNormal = aheadAsNormal;
	}

	public String getIsInterestBal() {
		return this.isInterestBal;
	}

	public void setIsInterestBal(String isInterestBal) {
		this.isInterestBal = isInterestBal;
	}

	public String getReserve() {
		return this.reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public String getReserve2() {
		return this.reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	public String getReserve3() {
		return this.reserve3;
	}

	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

	public BigDecimal getLastDate() {
		return this.lastDate;
	}

	public void setLastDate(BigDecimal lastDate) {
		this.lastDate = lastDate;
	}

	public BigDecimal getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(BigDecimal lastTime) {
		this.lastTime = lastTime;
	}

}
