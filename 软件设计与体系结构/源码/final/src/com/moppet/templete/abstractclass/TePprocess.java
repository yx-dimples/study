package com.moppet.templete.abstractclass;


// ģ��ģʽ
public abstract class TePprocess {
		// �Һ�
		public abstract void register();
		// ҽ��ȷ��
		public abstract void doctorConfirmed();
		// ����
		public abstract void pay();
		// ҽ������
		public abstract void doctorTreatment();
		// ��������
		public abstract void endofTreatment();
		
		public final void process(){
			this.register();
			this.doctorConfirmed();
			this.pay();
			this.doctorTreatment();
			this.endofTreatment();
		}
}
