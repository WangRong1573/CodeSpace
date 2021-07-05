const path = require("path");
const webpack = require("webpack")
const htmlWebpackPlugin = require("html-webpack-plugin")
const uglifyjsWebpackPlugin = require('uglifyjs-webpack-plugin')
module.exports = {
  entry:'./src/main.js',
  output:{
    //动态拼接路径
    path:path.resolve(__dirname,'../dist'),
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
      new webpack.BannerPlugin("最终版权归xx所有"),
      new htmlWebpackPlugin({
        //为自动生成的html配置模板，会找webpack.config.js同目录中的配置模板文件
        template:'index.html'
      }),
      // new uglifyjsWebpackPlugin()
  ],
  // devServer:{
  //   contentBase:"./dist",
  //   inline:true
  // }
}