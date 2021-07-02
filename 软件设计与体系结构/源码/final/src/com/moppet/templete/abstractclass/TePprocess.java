package com.moppet.templete.abstractclass;


// 模板模式
public abstract class TePprocess {
		// 挂号
		public abstract void register();
		// 医生确诊
		public abstract void doctorConfirmed();
		// 付费
		public abstract void pay();
		// 医生治疗
		public abstract void doctorTreatment();
		// 结束治疗
		public abstract void endofTreatment();
		
		public final void process(){
			this.register();
			this.doctorConfirmed();
			this.pay();
			this.doctorTreatment();
			this.endofTreatment();
		}
}
