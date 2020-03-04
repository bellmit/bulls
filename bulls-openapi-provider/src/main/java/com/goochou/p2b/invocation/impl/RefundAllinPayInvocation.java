package com.goochou.p2b.invocation.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.goochou.p2b.constant.pay.OutPayEnum;
import com.goochou.p2b.constant.pay.PayConstants;
import com.goochou.p2b.hessian.Request;
import com.goochou.p2b.hessian.openapi.pay.AllinPayRequest;
import com.goochou.p2b.hessian.openapi.pay.AllinPayResponse;
import com.goochou.p2b.invocation.BaseInvocation;
import com.goochou.p2b.invocation.IInvocation;
import com.goochou.p2b.utils.JSONAlibabaUtil;

/**
 * 
 * Created on 2017-6-8
 * <p>Title:       DEC集团系统_[OPENAPI]_[模块名]/p>
 * <p>Description: [汇率外部接口入参出参包装]</p>
 * <p>Copyright:   Copyright (c) 2015</p>
 * <p>Company:     澳钜（上海）教育科技有限公司</p>
 * <p>Department:  研发中心</p>
 * @author         [叶东平] [58294114@qq.com]
 * @version        1.0
 */
@Service
public class RefundAllinPayInvocation extends BaseInvocation implements IInvocation {

	/**
	 *  Created on 2017-6-8
	 * <p>Discription:[主方法]</p>
	 * @author:[叶东平]
	 * @update:[日期2017-6-8] [叶东平]
	 */
	@Override
	public AllinPayResponse executeService(Request request) {
	    AllinPayResponse res = new AllinPayResponse();
        String rspJson = "";
        try {
            rspJson = getRspXML(request, PayConstants.METHOD_REFUND, OutPayEnum.ALLINPAY.getFeatureName());
            logger.info("rspJson:"+rspJson);
            setResult(res,rspJson);
        } catch (Exception e)  {
            logger.error(e, e);
        }
        return res; 
	}
	/**
	 *  Created on 2017-6-8 
	 * <p>Discription:[出参包装]</p>
	 * @author:[叶东平]
	 * @update:[日期2017-6-8] [叶东平]
	 * @return void .
	 */
	private void setResult(AllinPayResponse res, String rspJson) {
        JSONObject obj = parseJSONString(rspJson);
        String code = JSONAlibabaUtil.getJsonStr(obj, "retcode");
        if(PayConstants.SUCCESS.equals(code)){
            String trxstatus = JSONAlibabaUtil.getJsonStr(obj, "trxstatus");
            if(PayConstants.RESP_CODE_SUCCESS.equals(trxstatus)) {
                res.setSuccess(true);
                String finTime = JSONAlibabaUtil.getJsonStr(obj, "fintime");
                String trxId = JSONAlibabaUtil.getJsonStr(obj, "trxid");
                String trxStatus = JSONAlibabaUtil.getJsonStr(obj, "trxstatus");
                res.setFinTime(finTime);
                res.setTrxId(trxId);
                res.setTrxStatus(trxStatus);
            }else {
                res.setSuccess(false);
                String errorMsg = JSONAlibabaUtil.getJsonStr(obj, "errmsg");
                res.setErrorMsg(errorMsg);
            }
        }else{
        	res.setSuccess(false);
        	String errorMsg = JSONAlibabaUtil.getJsonStr(obj, "retmsg");
        	res.setErrorMsg(errorMsg);
        }
    }

	/**
	 *  Created on 2017-6-8
	 * <p>Discription:[入参包装]</p>
	 * @author:[叶东平]
	 * @update:[日期2017-6-8] [叶东平]
	 */
	@Override
    protected String toJSONString(Request request) {
	    AllinPayRequest fsmr = (AllinPayRequest) request;
        String reqJSON = JSONArray.toJSONString(fsmr);
        return reqJSON;
    }

}
