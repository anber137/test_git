# devops-netology
## first modified 

## Игнорироваться будут:
* \*\*\/.terraform\/\* - любые файлы в поддиректории .terraform перед которой могут быть любые поддиректории
* \*.tfstate любые файлы с расширение tfstate
* \*.tfstate.\* любые файлы в имени которых содержититься .tfstate.
* crash.log - файл с именем crash.log
* *.tfvars - файл с расширением tfvars
* override.tf - файл с именем override.tf
* override.tf.json - файл с имененм override.tf.json
* \*\_override.tf - файл имя которого заканчивается на \_override.tf
* \*\_override.tf.json - файл имя которого заканчивается на \_override.tf.json
* .terraformrc - скрытый (для отображения в директории как правило используется команда ls с одним из параметром -a) файл >Ignore [CLI](https://en.wikipedia.org/wiki/Command-line_interface) configuration files
* terraform.rc аналогичный предыдущему но не скрытый и имеющий расширение rc
 
