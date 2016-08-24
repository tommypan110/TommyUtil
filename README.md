## 工具类用法

##PhotoPicker 图片选择器
PhotoPicker.builder()
           .setPhotoCount(9)
           .setShowCamera(true)
           .setShowGif(true)
           .setPreviewEnabled(false)
           .start(MainActivity.this, PhotoPicker.REQUEST_CODE);

if (resultCode == RESULT_OK && requestCode == PhotoPicker.REQUEST_CODE) {
           List<String> photos = null;
           if (data != null) {
               photos = data.getStringArrayListExtra(PhotoPicker.KEY_SELECTED_PHOTOS);
           }
           selectedPhotos.clear();
           if (photos != null) {

               selectedPhotos.addAll(photos);
           }
           photoAdapter.notifyDataSetChanged();
       } else if (resultCode == RESULT_OK && requestCode == PhotoPreview.REQUEST_CODE) {
           List<String> photos = null;
           if (data != null) {
               photos = data.getStringArrayListExtra("SELECTED_PHOTOS");
           }
           selectedPhotos.clear();
           if (photos != null) {

               selectedPhotos.addAll(photos);
           }
           photoAdapter.notifyDataSetChanged();
             }

#################################


#Luban    压缩图片
 Luban.get(this)
      .load(file)                     //传人要压缩的图片
      .putGear(Luban.THIRD_GEAR)      //设定压缩档次，默认三挡
      .setCompressListener(new OnCompressListener() { //设置回调
        @Override
        public void onSuccess(File file) {
            //回调返回压缩后图片
            files.add(file);
            }
        }).launch();    //启动压缩
#################################

