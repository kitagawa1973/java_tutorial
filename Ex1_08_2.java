/*-< ���K�FEx1_08_2 >---------------------------------
�R�����g�̓��e�ɏ]���ăv���O�������쐬���Ă��������B
----------------------------------------------------*/
class Ex1_08_2 {
	public static void main (String[] args) {
		
		/* �ȉ��̔z����������A�u�g�C�v�[�h���v���\�������v���O�������쐬���Ă��������B
		**     �z��    �Fanimals
		**     �ێ�����l
		**        animals[0][0]�F�A�����J���V���[�g�w�A
		**        animals[0][1]�F�}���`�J��
		**        animals[1][0]�F�W�����K���A���n���X�^�[
		**        animals[1][1]�F�n���l�Y�~
		**        animals[2][0]�F�I�J���C���R
		**        animals[2][1]�F�u���`���E
		**        animals[3][0]�F�S�[���f�����g���[�o�[
		**        animals[3][1]�F�g�C�v�[�h��
		*/
		String[][] animals = new String[4][2];
		animals[0][0] = "�A�����J���V���[�g�w�A";
		animals[0][1] = "�}���`�J��";
		animals[1][0] = "�W�����K���A���n���X�^�[";
		animals[1][1] = "�n���l�Y�~";
		animals[2][0] = "�I�J���C���R";
		animals[2][1] = "�u���`���E";
		animals[3][0] = "�S�[���f�����g���[�o�[";
		animals[3][1] = "�g�C�v�[�h��";
		
		System.out.println( animals[3][1] );
		
		
	}
}
