import PropTypes from 'prop-types'
import Button from './Button';


const Header = ({title}) => {
  return (
    <header className="d-flex justify-content-around mt-5" style={{ border: '1px solid blue' }}>
        <h1>{title}</h1>
        <Button buttonContent={"Add"}/>
    </header>
  )
}

Header.defaultProps = {
    title: 'Budget Tracker',
}

Header.propTypes = {
    title: PropTypes.string.isRequired,
}

export default Header