const path = require("path");
const webpack = require("webpack")
module.exports = {
  entry:'./src/main.js',
  output:{
    //动态拼接路径
    path:path.resolve(__dirname,'dist'),
    filename:'bundle.js'
  },
  module: {
    rules: [
      {
        test: /\.css$/,
        use: [ 'style-loader', 'css-loader' ]
      },
      {
        test: /\.vue$/,
        use: ['vue-loader']
      }
    ]
  },
  resolve:{
    alias:{
      "vue$":"vue/dist/vue.esm.js"
    }
  },
  plugins:[
    new webpack.BannerPlugin("最终版权归xx所有")
  ]
}