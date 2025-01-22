<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="年月份" prop="nianyuefen">
          <el-input v-model="ruleForm.nianyuefen" 
              placeholder="年月份" clearable  :readonly="ro.nianyuefen"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="年月份" prop="nianyuefen">
              <el-input v-model="ruleForm.nianyuefen" 
                placeholder="年月份" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="员工工号" prop="yuangonggonghao">
          <el-input v-model="ruleForm.yuangonggonghao" 
              placeholder="员工工号" clearable  :readonly="ro.yuangonggonghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="员工工号" prop="yuangonggonghao">
              <el-input v-model="ruleForm.yuangonggonghao" 
                placeholder="员工工号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="员工姓名" prop="yuangongxingming">
          <el-input v-model="ruleForm.yuangongxingming" 
              placeholder="员工姓名" clearable  :readonly="ro.yuangongxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="员工姓名" prop="yuangongxingming">
              <el-input v-model="ruleForm.yuangongxingming" 
                placeholder="员工姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="部门" prop="bumen">
          <el-input v-model="ruleForm.bumen" 
              placeholder="部门" clearable  :readonly="ro.bumen"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="部门" prop="bumen">
              <el-input v-model="ruleForm.bumen" 
                placeholder="部门" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="职位" prop="zhiwei">
          <el-input v-model="ruleForm.zhiwei" 
              placeholder="职位" clearable  :readonly="ro.zhiwei"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="职位" prop="zhiwei">
              <el-input v-model="ruleForm.zhiwei" 
                placeholder="职位" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="底薪" prop="dixin">
          <el-input v-model="ruleForm.dixin" 
              placeholder="底薪" clearable  :readonly="ro.dixin"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="底薪" prop="dixin">
              <el-input v-model="ruleForm.dixin" 
                placeholder="底薪" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="全勤奖" prop="quanqinjiang">
          <el-input v-model="ruleForm.quanqinjiang" 
              placeholder="全勤奖" clearable  :readonly="ro.quanqinjiang"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="全勤奖" prop="quanqinjiang">
              <el-input v-model="ruleForm.quanqinjiang" 
                placeholder="全勤奖" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="加班费" prop="jiabanfei">
          <el-input v-model="ruleForm.jiabanfei" 
              placeholder="加班费" clearable  :readonly="ro.jiabanfei"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="加班费" prop="jiabanfei">
              <el-input v-model="ruleForm.jiabanfei" 
                placeholder="加班费" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="其它扣款" prop="qitakoukuan">
          <el-input v-model="ruleForm.qitakoukuan" 
              placeholder="其它扣款" clearable  :readonly="ro.qitakoukuan"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="其它扣款" prop="qitakoukuan">
              <el-input v-model="ruleForm.qitakoukuan" 
                placeholder="其它扣款" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'" label="金额" prop="jine">
            <el-input v-model="jine"
                placeholder="金额" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.jine" label="金额" prop="jine">
              <el-input v-model="ruleForm.jine" 
                placeholder="金额" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="工资备注" prop="gongzibeizhu">
          <el-input v-model="ruleForm.gongzibeizhu" 
              placeholder="工资备注" clearable  :readonly="ro.gongzibeizhu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="工资备注" prop="gongzibeizhu">
              <el-input v-model="ruleForm.gongzibeizhu" 
                placeholder="工资备注" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="登记时间" prop="dengjishijian">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.dengjishijian" 
                type="datetime"
                :readonly="ro.dengjishijian"
                placeholder="登记时间">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.dengjishijian" label="登记时间" prop="dengjishijian">
              <el-input v-model="ruleForm.dengjishijian" 
                placeholder="登记时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
      <el-form-item class="btn">
        <el-button  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"rgba(255, 140, 136, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"30px 30px 0 0 ","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"rgba(255, 255, 255, 1)","addEditBoxColor":"rgba(255, 255, 255, 0)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(255, 140, 136, 1)","uploadIconFontColor":"rgba(255, 140, 136, 1)","textareaBorderColor":"rgba(255, 140, 136, 1)","btnCancelBgColor":"rgba(255, 255, 255, 1)","selectLableColor":"rgba(255, 255, 255, 1)","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"rgba(255, 140, 136, 1)","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"rgba(255, 140, 136, 1)","dateIconFontColor":"rgba(255, 140, 136, 1)","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"rgba(255, 255, 255, 1)","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"rgba(255, 255, 255, 1)","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"30px 30px 0 0 ","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"rgba(255, 255, 255, 1)","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"rgba(255, 140, 136, 1)","inputBorderColor":"rgba(255, 140, 136, 1)","uploadBorderColor":"rgba(255, 140, 136, 1)","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"5px 0 0 0 ","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(255, 255, 255, 1)","btnSaveBorderWidth":"5px 0 0 0"},
      id: '',
      type: '',
      ro:{
	nianyuefen : false,
	yuangonggonghao : false,
	yuangongxingming : false,
	bumen : false,
	zhiwei : false,
	dixin : false,
	quanqinjiang : false,
	jiabanfei : false,
	qitakoukuan : false,
	jine : false,
	gongzibeizhu : false,
	dengjishijian : false,
	ispay : false,
      },
      ruleForm: {
        nianyuefen: '',
        yuangonggonghao: '',
        yuangongxingming: '',
        bumen: '',
        zhiwei: '',
        dixin: '',
        quanqinjiang: '',
        jiabanfei: '',
        qitakoukuan: '',
        jine: '',
        gongzibeizhu: '',
        dengjishijian: '',
      },
      rules: {
          nianyuefen: [
                { required: true, message: '年月份不能为空', trigger: 'blur' },
          ],
          yuangonggonghao: [
          ],
          yuangongxingming: [
          ],
          bumen: [
          ],
          zhiwei: [
          ],
          dixin: [
                { required: true, message: '底薪不能为空', trigger: 'blur' },
                { validator: validateNumber, trigger: 'blur' },
          ],
          quanqinjiang: [
                { required: true, message: '全勤奖不能为空', trigger: 'blur' },
                { validator: validateNumber, trigger: 'blur' },
          ],
          jiabanfei: [
                { required: true, message: '加班费不能为空', trigger: 'blur' },
                { validator: validateNumber, trigger: 'blur' },
          ],
          qitakoukuan: [
                { required: true, message: '其它扣款不能为空', trigger: 'blur' },
                { validator: validateNumber, trigger: 'blur' },
          ],
          jine: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          gongzibeizhu: [
          ],
          dengjishijian: [
          ],
          ispay: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {
    jine: {
      get: function () {
        return 0+parseFloat(this.ruleForm.dixin==""?0:this.ruleForm.dixin)+parseFloat(this.ruleForm.quanqinjiang==""?0:this.ruleForm.quanqinjiang)+parseFloat(this.ruleForm.jiabanfei==""?0:this.ruleForm.jiabanfei)-parseFloat(this.ruleForm.qitakoukuan==""?0:this.ruleForm.qitakoukuan) || 0
      }
    },



  },
  created() {
	this.ruleForm.dengjishijian = this.getCurDateTime()

	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='nianyuefen'){
            this.ruleForm.nianyuefen = obj[o];
	    this.ro.nianyuefen = true;
            continue;
          }
          if(o=='yuangonggonghao'){
            this.ruleForm.yuangonggonghao = obj[o];
	    this.ro.yuangonggonghao = true;
            continue;
          }
          if(o=='yuangongxingming'){
            this.ruleForm.yuangongxingming = obj[o];
	    this.ro.yuangongxingming = true;
            continue;
          }
          if(o=='bumen'){
            this.ruleForm.bumen = obj[o];
	    this.ro.bumen = true;
            continue;
          }
          if(o=='zhiwei'){
            this.ruleForm.zhiwei = obj[o];
	    this.ro.zhiwei = true;
            continue;
          }
          if(o=='dixin'){
            this.ruleForm.dixin = obj[o];
	    this.ro.dixin = true;
            continue;
          }
          if(o=='quanqinjiang'){
            this.ruleForm.quanqinjiang = obj[o];
	    this.ro.quanqinjiang = true;
            continue;
          }
          if(o=='jiabanfei'){
            this.ruleForm.jiabanfei = obj[o];
	    this.ro.jiabanfei = true;
            continue;
          }
          if(o=='qitakoukuan'){
            this.ruleForm.qitakoukuan = obj[o];
	    this.ro.qitakoukuan = true;
            continue;
          }
          if(o=='jine'){
            this.ruleForm.jine = obj[o];
	    this.ro.jine = true;
            continue;
          }
          if(o=='gongzibeizhu'){
            this.ruleForm.gongzibeizhu = obj[o];
	    this.ro.gongzibeizhu = true;
            continue;
          }
          if(o=='dengjishijian'){
            this.ruleForm.dengjishijian = obj[o];
	    this.ro.dengjishijian = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `yuangonggongzi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
        this.ruleForm.jine = this.jine



























var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "yuangonggongzi/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `yuangonggongzi/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.yuangonggongziCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `yuangonggongzi/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.yuangonggongziCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.yuangonggongziCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
